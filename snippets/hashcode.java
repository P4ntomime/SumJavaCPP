¦¦@Override
public int hashCode() {
    return firstname.hashCode() + 31 * lastname.hashCode();
}