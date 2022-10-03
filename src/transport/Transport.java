package transport;

public abstract class Transport {
    private static final String DEFAUL_VALUE = "<no info>";

    private String brand;
    private String model;
    private float engineVolume;

    protected Transport(String brand, String model, float engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    protected abstract void startMoving();

    protected abstract void endMoving();

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = ((brand == null) || (brand.isBlank()))
                ? DEFAUL_VALUE
                : brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = ((model == null) || (model.isBlank()))
                ? DEFAUL_VALUE
                : model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = Math.max(engineVolume, 0.5F);
    }
}
