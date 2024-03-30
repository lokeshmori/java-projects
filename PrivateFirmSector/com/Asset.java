package privatefirm.com;

public class Asset {

	private String assetId ;
	private String assetName ;
	private String assetExpiry ;
	public Asset(String assetId, String assetName, String assetExpiry) {
		// super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.assetExpiry = assetExpiry;
	}
	public String getAssetId() {
		return assetId;
	}
	
	public void setAssetId(String assetId) {
        if (isValidAssetId(assetId)) {
            this.assetId = assetId;
        } 
    }

    private boolean isValidAssetId(String assetId) {
        // Regular expression to match the required pattern
        String regex = "^(DSK|LTP|IPH)-\\d{6}[HLhl]$";
        return assetId.matches(regex);
    }
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getAssetExpiry() {
		return assetExpiry;
	}
	public void setAssetExpiry(String assetExpiry) {
		this.assetExpiry = assetExpiry;
	}
	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", assetName=" + assetName + ", assetExpiry=" + assetExpiry + "]";
	}
	
	
	
	
	
}
