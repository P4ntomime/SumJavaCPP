static int sum(int... values) {
    int result = 0;
    for (int value : values) {
        result += value;
    }
    return result;
}