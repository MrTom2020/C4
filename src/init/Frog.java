package init;

import Animals.Animal;
import Interface.ISound;

public class Frog extends Animal implements ISound
{
    private String _Name;
    private String _Age;
    private String _Sex;
    private String _Animal_Shout;
    public Frog(String Name,String Age,String Sex)
    {
        super();
        this._Age = Age;
        this._Name = Name;
        this._Sex = Sex;
    }

    public String get_Name() {
        return _Name;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public String get_Age() {
        return _Age;
    }

    public void set_Age(String _Age) {
        this._Age = _Age;
    }

    public String get_Sex() {
        return _Sex;
    }

    public void set_Sex(String _Sex) {
        this._Sex = _Sex;
    }

    public String get_Animal_Shout() {
        return _Animal_Shout;
    }

    public void set_Animal_Shout(String _Animal_Shout) {
        this._Animal_Shout = _Animal_Shout;
    }

    @Override
    public void ISound() {
        _Animal_Shout = "Ộp";
    }
}
