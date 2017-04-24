# sockets
Java pocket project to test single-thread client-server TCP communication, used to support the teaching of Distributed Systems to my Computer Science students.

The repository holds actually 2 applications: **client** and **server**. They are simple implementations for a single-thread TCP message delivery system. The client stablishes connection to the server and send the user's input to the server, which prints it to terminal.

Parameters such as host and port are all hardcoded which is just an obvious improvement opportunity. Take a look in the License section further below if you like to help me improve the example.

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

Feel free to clone it, improve it and share it independently if you want. Or maybe you'd rather go further and create a pull request.

## Support
No support will be provided. Use it at your own risk. But if you need to get in touch for any other reason or you have significant improvement advices to share, please open an issue and I promise I'll try to respond it as soon as possible.