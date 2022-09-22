public class Main {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Grande";
        lada.yearOfProduction = 2015;
        lada.assemblyCountry = "Russia";
        lada.color = "yellow";
        lada.engineVolume = 1.7F;

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.yearOfProduction = 2020;
        audi.assemblyCountry = "Germany";
        audi.color = "black";
        audi.engineVolume = 3.0F;

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.assemblyCountry = "Germany";
        bmw.yearOfProduction = 2021;
        bmw.color = "black";
        bmw.engineVolume = 3.0F;

        Car kia =  new Car();
        kia.brand = "Kia";
        kia.model = "Sportage mk4";
        kia.yearOfProduction = 2018;
        kia.assemblyCountry = "South Korea";
        kia.color = "red";
        kia.engineVolume = 2.4F;

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.assemblyCountry = "South Korea";
        hyundai.color = "orange";
        hyundai.engineVolume = 1.6F;
        hyundai.yearOfProduction = 2016;

        System.out.printf("%s\n%s\n%s\n%s\n%s\n", lada, audi, bmw, kia, hyundai);
    }
}
