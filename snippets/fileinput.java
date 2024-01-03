var in = new FileInputStream("in.txt");!\lstnode{fileinnew}!
int value = in.read();
while(value >= 0) {!\lstnode{fileineof}!
    byte b = (byte)value;!\lstnode{fileinread}!
    // Mit b arbeiten
    value = in.read();
}
in.close();