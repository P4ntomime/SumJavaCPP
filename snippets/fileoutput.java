var out = new FileOutputStream("out.txt");!\lstnode{fileoutnew}!
while(...){
    byte b = ...;
    out.write(b);
}
out.close();!\lstnode{fileoutclose}!

new FileOutputStream("out.txt", true);!\lstnode{fileoutappend}!