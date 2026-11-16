
import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(("127.0.0.1", 5000))

reg = input("Enter Register Number: ")
client.send(reg.encode())

result = client.recv(1024).decode()
print("Result:", result)

client.close()
