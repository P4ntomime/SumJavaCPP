try(var rd = new FileReader("a.txt")){
    int val = rd.read();
    while (val >= 0) { //...
    }
}