from zeep import Client

client = Client(wsdl='http://www.dneonline.com/calculator.asmx?wsdl')
print(client.service.Add(12, 13))