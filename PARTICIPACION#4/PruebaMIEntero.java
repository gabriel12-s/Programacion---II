public class PruebaMIEntero {
    public static void main(String[] args) {
        MIEntero num1 = new MIEntero(4);   
        MIEntero num2 = new MIEntero(7);   
        MIEntero num3 = new MIEntero(10);  
        MIEntero num4 = new MIEntero(1);   

        System.out.println("Métodos de instancia:");
        System.out.println("num1.esPar(): " + num1.esPar());  
        System.out.println("num2.esImpar(): " + num2.esImpar());  
        System.out.println("num2.esPrimo(): " + num2.esPrimo());  
        System.out.println("num1.equals(4): " + num1.equals(4));  
        System.out.println("num1.equals(num3): " + num1.equals(num3));  

        System.out.println("\nMétodos estáticos con int:");
        System.out.println("MIEntero.esPar(4): " + MIEntero.esPar(4));  
        System.out.println("MIEntero.esImpar(7): " + MIEntero.esImpar(7));  
        System.out.println("MIEntero.esPrimo(7): " + MIEntero.esPrimo(7));  

        System.out.println("\nMétodos estáticos con MIEntero:");
        System.out.println("MIEntero.esPar(num1): " + MIEntero.esPar(num1));  
        System.out.println("MIEntero.esPrimo(num4): " + MIEntero.esPrimo(num4));  
        System.out.println("\nMétodos parseInt:");
        char[] digs = {'1', '2', '3'};
        System.out.println("parseInt(['1','2','3']): " + MIEntero.parseInt(digs));  
        System.out.println("parseInt('456'): " + MIEntero.parseInt("456"));  
        MIEntero numParse = new MIEntero(MIEntero.parseInt("789"));
        System.out.println("numParse.get(): " + numParse.get());  

        
    }
}
