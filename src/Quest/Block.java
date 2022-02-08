package Quest;


import java.util.ArrayList;

public class Block {
    public String value;
    public Integer index_1;
    public Integer index_2;
    public String type;

    public Block(String type, String value, Integer index_1, Integer index_2){
        this.type = type;
        this.value = value;
        this.index_1 = index_1;
        this.index_2 = index_2;
    }


}
