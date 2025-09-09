import math
class MIEntero:
    def __init__(self, valor):
        self.valor = valor

    def get(self):
        return self.valor

    def esPar(self):
        return self.valor % 2 == 0

    def esImpar(self):
        return not self.esPar()

    def esPrimo(self):
        if self.valor <= 1:
            return False
        for i in range(2, int(math.sqrt(self.valor)) + 1):
            if self.valor % i == 0:
                return False
        return True

    def equals(self, valor):
        if isinstance(valor, int):
            return self.valor == valor
        elif isinstance(valor, MIEntero):
            return self.valor == valor.valor
        return False

    @staticmethod
    def esPar(val):
        if isinstance(val, int):
            return val % 2 == 0
        elif isinstance(val, MIEntero):
            return val.esPar()
        return False

    @staticmethod
    def esImpar(val):
        return not MIEntero.esPar(val)

    @staticmethod
    def esPrimo(val):
        if isinstance(val, int):
            if val <= 1:
                return False
            for i in range(2, int(math.sqrt(val)) + 1):
                if val % i == 0:
                    return False
            return True
        elif isinstance(val, MIEntero):
            return val.esPrimo()
        return False

    @staticmethod
    def parseInt(digs):
        resultado = 0
        for c in digs:
            if c.isdigit():
                resultado = resultado * 10 + int(c)
        return resultado

    @staticmethod
    def parseInt_str(str_val):
        resultado = 0
        for c in str_val:
            if c.isdigit():
                resultado = resultado * 10 + int(c)
        return resultado

    def __str__(self):
        return f"MIEntero{{valor={self.valor}}}"