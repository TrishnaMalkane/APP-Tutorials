
import socket

client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

n = int(input("Enter Number of Sensors: "))

for i in range(n):
    temp = input("Enter Temperature: ")
    client.sendto(temp.encode(), ("127.0.0.1", 5001))

client.close()
