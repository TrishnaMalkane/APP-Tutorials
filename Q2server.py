
import socket

server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server.bind(("127.0.0.1", 5001))

print("Weather Server Started")

while True:
    data, addr = server.recvfrom(1024)
    print("Temperature Received:", data.decode())
