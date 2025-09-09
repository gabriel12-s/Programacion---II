
num1 = MIEntero(4)  
num2 = MIEntero(7)  
num3 = MIEntero(10) 
num4 = MIEntero(1)   

print("Métodos de instancia:")
print(f"num1.esPar(): {num1.esPar()}")  
print(f"num2.esImpar(): {num2.esImpar()}")  
print(f"num2.esPrimo(): {num2.esPrimo()}")  
print(f"num1.equals(4): {num1.equals(4)}")  
print(f"num1.equals(num3): {num1.equals(num3)}")  

print("\nMétodos estáticos con int:")
print(f"MIEntero.esPar(4): {MIEntero.esPar(4)}")  
print(f"MIEntero.esImpar(7): {MIEntero.esImpar(7)}") 
print(f"MIEntero.esPrimo(7): {MIEntero.esPrimo(7)}") 

print("\nMétodos estáticos con MIEntero:")
print(f"MIEntero.esPar(num1): {MIEntero.esPar(num1)}")  
print(f"MIEntero.esPrimo(num4): {MIEntero.esPrimo(num4)}")  

print("\nMétodos parseInt:")
digs = ['1', '2', '3']
print(f"parseInt(['1','2','3']): {MIEntero.parseInt(digs)}")  
print(f"parseInt_str('456'): {MIEntero.parseInt_str('456')}") 
num_parse = MIEntero(MIEntero.parseInt_str('789'))
print(f"num_parse.get(): {num_parse.get()}") 


    