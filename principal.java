public class principal {
    
    public static void main(String args[]) {

    patinete pat = new patinete("brincks","duas rodas","azul",2022);
    mobilete mob = new mobilete("mobizig","125cc2t","vermelho",2011);
    bike bik = new bike("GTA","aro29","verde",2020);

    System.out.println(" ");
    
    System.out.println(pat.getMarca());
    System.out.println(pat.getModelo());
    System.out.println(pat.getCor());
    System.out.println(pat.getAno());

    System.out.println(" ");

    System.out.println(mob.getMarca());
    System.out.println(mob.getModelo());
    System.out.println(mob.getCor());
    System.out.println(mob.getAno());

    System.out.println(" ");

    System.out.println(bik.getMarca());
    System.out.println(bik.getModelo());
    System.out.println(bik.getCor());
    System.out.println(bik.getAno());

    }
}
