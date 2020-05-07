'''
Para variáveis quantitativas apresentar:
média, mediana, desvio padrão, valor máximo, valor mínimo, variância, quartil.

Para variáveis categóricas apresentar a frequência absoluta, relativa e moda.
Para cada pergunta que contenha variáveis quantitativas (numéricas), calcule,
intérprete e compare os resultados da média, mediana, moda e desvio padrão.
Utilize a criatividade para apresentar os valores calculados.
'''

import pandas as pd

wine = pd.read_csv("wineDataSet.csv", skiprows=0, header=None)

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
print("\n### Variância ###")
print(wine.var(axis=0))
print("\n### QUARTIL 1 ###")
print(wine.quantile(.1, axis = 0))
