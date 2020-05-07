import download_dataset
import pandas as pd
wine = pd.read_csv("DataSet.csv", skiprows=0, header=None)

wine.columns = ['classOfWine', 'alcohol', 'malicAcid', 'ash', 'ashalcalinity'
    , 'magnesium', 'totalPhenols', 'flavanoids', 'nonFlavanoidPhenols', 'proanthocyanins'
    , 'colorIntensity', 'hue', 'od280_od315', 'proline']

print("### Média ###")
print(wine.mean(axis=0))
print("\n### Mediana ###")
print(wine.median(axis=0))
print("\n### Desvio Padrão ###")
print(wine.std(axis=0))
print("\n### Valor Máximo ###")
print(wine.max(axis=0))
print("\n### Valor Mínimo ###")
print(wine.min(axis=0))
print("\n### Variância ###")
print(wine.var(axis=0))

print("\n### QUARTIS ###")
df = pd.DataFrame(wine)
pd.set_option('display.max_columns', 500)

print(df.quantile([.25,.5,.75],axis=0))

