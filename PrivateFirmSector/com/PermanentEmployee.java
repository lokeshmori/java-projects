package privatefirm.com;

//import java.util.Arrays;

// import java.util.Arrays;

//import java.util.Arrays;

public class PermanentEmployee extends Employee {

    private double basicPay;
    private String[] salaryComponents;
    private float experience;
    private Asset[] assets;

    public PermanentEmployee(String employeeName, double basicPay, String[] salaryComponents, Asset[] assets) {
        super(employeeName);
        this.basicPay = basicPay;
        this.salaryComponents = salaryComponents;
        this.assets = assets;
    }

public double calculateBonus(float experience) throws InvalidExperienceException{
		
	   
		double bonus = 0 ;
		if(experience  < 2.5) {
			
			new  InvalidExperienceException("A minimum of 2.5 years is required for bonus!");
		} else if(experience >= 2.5 && experience <4) {
			bonus =  2550 ;
		}else if(experience >= 4 && experience <8) {
			bonus =  5000 ;
		}else if(experience >= 8 && experience <12) {
			bonus =  8750 ;
		}else {
			bonus = 13000;
		}
		
		return bonus ;
	}
	
	
    @Override
	public void calculateSalary(float experience) {
		// TODO Auto-generated method stub
    	this.experience = experience ;
    	double bonusAmount = 0 ;;
		try {
			bonusAmount = calculateBonus(experience);
		} catch (InvalidExperienceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        double salary = 0;
        float daPercentage = getPercentage("DA");
        float hraPercentage = getPercentage("HRA");
        double daComponent = basicPay * daPercentage / 100;
        double hraComponent = basicPay * hraPercentage / 100;
        double salaryBeforeBonus = basicPay + daComponent + hraComponent;
        salary = salaryBeforeBonus + bonusAmount;
        setSalary(Math.round(salary));
    }

    public float getPercentage(String component) {
        for (String item : salaryComponents) {
            String[] parts = item.split("-");
            if (parts.length == 2 && parts[0].equals(component)) {
                return Float.parseFloat(parts[1]);
            }
        }
        return 0; // Default to 0 if component not found
    }

    public Asset[] getAssetsByDate(String lastDate) throws InvalidAssetsException {
        int count = 0;
        for (Asset asset : assets) {
            if (isBeforeOrEqual(asset.getAssetExpiry(), lastDate)) {
                count++;
            }
        }

        if (count == 0) {
            throw new InvalidAssetsException("No assets found for the given criteria!");
        }

        Asset[] expiryAssets = new Asset[count];
        int i = 0;
        for (Asset asset : assets) {
            if (isBeforeOrEqual(asset.getAssetExpiry(), lastDate)) {
                expiryAssets[i++] = asset;
            }
        }
        return expiryAssets;
    }

    public boolean isBeforeOrEqual(String assetEx, String lastD) {
        String[] arr1 = assetEx.split("-");
        String[] arr2 = lastD.split("-");

        int aEYear = Integer.parseInt(arr1[0]);
        int lDYear = Integer.parseInt(arr2[0]);

        int aEMonth = Resources.getMonth(arr1[1]);
        int lDMonth = Resources.getMonth(arr2[1]);

        int aEDate = Integer.parseInt(arr1[2]);
        int lDate = Integer.parseInt(arr2[2]);

        if (aEYear < lDYear) {
            return true;
        } else if (aEYear == lDYear && aEMonth < lDMonth) {
            return true;
        } else if (aEYear == lDYear && aEMonth == lDMonth && aEDate <= lDate) {
            return true;
        }
        return false;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public String[] getSalaryComponents() {
        return salaryComponents;
    }

    public void setSalaryComponents(String[] salaryComponents) {
        this.salaryComponents = salaryComponents;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public Asset[] getAssets() {
        return assets;
    }

    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }

    
}

    

