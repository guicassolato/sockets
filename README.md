# sockets
Java pocket project to test client-server TCP communication, used to support the teaching of Distributed Systems to my Computer Science students.

The repository holds actually 2 applications: **client** and **server**. They are simple implementations for a multi-thread TCP message delivery system. Each client stablishes connection to the server and sends the user's input to the server. The server broadcasts the received message to all clients. It works as a simple chat system.

The project evolved from an even simpler single-thread implementation, where one client used to send messages to the server, which simply printed the message to the terminal. It was never my intention to develop both versions (single-thread and multithread) separetely; instead, I just kept the history, and only for didactic purposes. You can easily jump to that version by using the git tag ``single-thread`` as a shortcut.

Parameters such as host and port are both still hardcoded to *127.0.0.1* and *12345*, respectively, which remains the most obvious improvement opportunity. Take a look into the License section further below if you like to help me improve the example.

## Usage
First compile both applications using ``javac``. Then, in two separate shells,

### Client
```
java Cliente
```

### Server
```
java Servidor
```

## License
Feel free to fork it, improve it and share it independently as you wish. Or maybe you'd rather go further and create a pull request so we can work together.

## Support
No support will be provided. Use it at your own risk. But if you need to get in touch for any other reason or you have significant improvement advices to share, please open an issue and I promise I'll try to respond it as soon as possible.