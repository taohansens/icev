import pandas as pd

car = pd.read_csv("carDataSet.csv", skiprows=0, header=None)

car.columns = ['mpg', 'cylinders', 'displacement', 'horsepower', 'weight', 'acceleration', 'model year', 'origin'
    , 'carName']

print("### Média ###")
print(car.mean(axis=0))
print("\n### Mediana ###")
print(car.median(axis=0))
print("\n### Desvio Padrão ###")
print(car.std(axis=0))
print("\n### Valor Máximo ###")
print(car.max(axis=0))
print("\n### Valor Mínimo ###")
print(car.min(axis=0))
print("\n### Variância ###")
print(car.var(axis=0))
