
import socket

results = {
    "101": "Pass",
    "102": "Fail",
    "103": "Pass"
}

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(("127.0.0.1", 5000))
server.listen(1)

print("Server waiting for client...")

while True:
    conn, addr = server.accept()

    reg = conn.recv(1024).decode()
    print("Register Number:", reg)

    result = results.get(reg, "Student Not Found")
    conn.send(result.encode())

    conn.close()
