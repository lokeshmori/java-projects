package privatefirm.com;
public class Admin {

    public void generateSalarySlip(Employee[] employees, float[] salaryFactor) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            float factor = salaryFactor[i];

            if (employee instanceof ContractEmployee) {
                ((ContractEmployee) employee).calculateSalary(factor);
            } else if (employee instanceof PermanentEmployee) {
                ((PermanentEmployee) employee).calculateSalary(factor);
            }
        }
    }

    public int generateAssetsReport(Employee[] employees, String lastDate) {
        int totalAssets = 0;
        for (Employee employee : employees) {
            if (employee instanceof PermanentEmployee) {
                PermanentEmployee permanentEmployee = (PermanentEmployee) employee;
                try {
                    Asset[] assets = permanentEmployee.getAssetsByDate(lastDate);
                    if (assets != null) {
                        totalAssets += assets.length;
                    }
                } catch (InvalidAssetsException e) {
                    return -1;
                }
            }
        }
        return totalAssets;
    }
    
    

    public String[] generateAssetsReport(Employee[] employees, char assetCategory) {
        int count = countAssets(employees, assetCategory);
        String[] assetArray = new String[count];
        int index = 0;

        for (Employee employee : employees) {
            if (employee instanceof PermanentEmployee) {
                PermanentEmployee permanentEmployee = (PermanentEmployee) employee;
                Asset[] assets = permanentEmployee.getAssets();
                if (assets != null) {
                    for (Asset asset : assets) {
                        if (Character.toLowerCase(asset.getAssetId().charAt(0)) == Character.toLowerCase(assetCategory)) {
                            assetArray[index++] = asset.getAssetId();
                        }
                    }
                }
            }
        }
        return assetArray;
    }

    public  int countAssets(Employee[] employees, char assetCategory) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee instanceof PermanentEmployee) {
                PermanentEmployee permanentEmployee = (PermanentEmployee) employee;
                Asset[] assets = permanentEmployee.getAssets();
                if (assets != null) {
                    for (Asset asset : assets) {
                        if (Character.toLowerCase(asset.getAssetId().charAt(0)) == Character.toLowerCase(assetCategory)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count * 3; // Return thrice the count for the length of the array
    }
}
