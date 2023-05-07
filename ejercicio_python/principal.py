from modeloUniversidad import Universidad

arregloU = []

def main():
    while True:
            print("=========================================")
            print("Registro de universidades")
            print("1. Nueva Universidad")
            print("2. Ver Universidades")
            seleccion = int(input())

            if seleccion == 1:
                print("===Datos de la Universidad===")
                nombre= input("Escriba el nombre: ")
                siglas= input("Escriba las siglas: ")
                direc= input("Escriba la dirección: ")
                numProf=int(input("Escriba la cantidad de profesores: "))
                u = Universidad(nombre, siglas, direc, numProf)
                arregloU.append(u)
                u.agregarCarreras()
                

            if seleccion == 2:
                print("======Universidades======")
                registro=0
                while registro < len(arregloU):
                                    arregloU[registro].imprimirInformacion()
                                    arregloU[registro].listadoCarreras()
                                    arregloU[registro].listadoCarreras()[0].imprimirInformacion()
                                    arregloU[registro].listadoCarreras()[1].imprimirInformacion()
                                    registro+=1


if __name__ == "__main__":
    main()
