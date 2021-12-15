package Animals;

import Interface.ISound;

public abstract class Cat extends Animal implements ISound {
    private String _Name;
    private String _Age;
    private String _Sex;
    private String _Animal_Shout;

    void Cat(String Name, String Age) {

    }

    @Override
    public String get_Name() {
        return _Name;
    }

    @Override
    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    @Override
    public String get_Age() {
        return _Age;
    }

    @Override
    public void set_Age(String _Age) {
        this._Age = _Age;
    }

    @Override
    public String get_Sex() {
        return _Sex;
    }

    @Override
    public void set_Sex(String _Sex) {
        this._Sex = _Sex;
    }

    @Override
    public String get_Animal_Shout() {
        return _Animal_Shout;
    }

    @Override
    public void set_Animal_Shout(String _Animal_Shout) {
        this._Animal_Shout = _Animal_Shout;
    }
    @Override
    public void ISound() {
        _Animal_Shout = "Meo";
    }
    public void output_array()
    {
        System.out.println("\nTên : " + get_Name() + "\nTuổi : " + get_Age() + "\nGiới tính : " + get_Sex());
    }

}
