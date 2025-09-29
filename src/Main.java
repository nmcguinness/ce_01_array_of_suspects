//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.Run();
    }

    public void Run()
    {
        //read contents

        //parse contents into LicensePlate
        LicensePlate l1 = new LicensePlate("191 L 12345");
        System.out.println(l1);

        //test parsed contents
        System.out.println(l1.Validate());

        //store match
    }
}