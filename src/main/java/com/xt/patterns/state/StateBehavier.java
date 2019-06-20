package com.xt.patterns.state;

/**
 * Create User: wangtao
 * Create In 2019-06-03 17:52
 * Description:
 **/
public class StateBehavier {

    public static final State one = new One();
    public static final State two = new Two();
    public static final State three = new Three();
    public State state = one;

    public void setState(State state) {
        this.state = state;
    }

    public void change() {
        state.change();
    }

    public static void main(String[] args) {
        StateBehavier stateBehavier = new StateBehavier();
        stateBehavier.change();
        stateBehavier.setState(StateBehavier.two);
        stateBehavier.change();
        stateBehavier.setState(StateBehavier.three);
        stateBehavier.change();
    }

}
