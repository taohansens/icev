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

wine.columns = ['class', 'alcohol', 'malicAcid', 'ash', 'ashalcalinity'
    , 'magnesium', 'totalPhenols', 'flavanoids', 'nonFlavanoidPhenols', 'proanthocyanins'
    , 'colorIntensity', 'hue', 'od280_od315', 'proline']


print("### Média ###")
print(wine.mean(axis=0))

#print(wine['alcohol'].mean())
#print(wine['malicAcid'].mean())