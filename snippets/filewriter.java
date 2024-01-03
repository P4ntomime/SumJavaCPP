try(var wr = new FileWriter("b.txt", true)){
    wr.write("Hello");
    wr.write('\n');
}