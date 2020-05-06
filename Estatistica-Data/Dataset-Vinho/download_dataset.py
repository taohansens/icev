import requests
download_url = "http://archive.ics.uci.edu/ml/machine-learning-databases/wine/wine.data"
arquivoDt = "wineDataSet.csv"

response = requests.get(download_url)
response.raise_for_status()
with open(arquivoDt, "wb") as f:
    f.write(response.content)
print("Download [OK]")