package me.xueyao.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String[] array;
    private Set<String> set;
    
    private Map<String,String> map;
    
    private Properties props;
    
    
    public void setArray(String[] array) {
        this.array = array;
    }
    
    
    public void setSet(Set<String> set) {
        this.set = set;
    }


    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    
    public void setProps(Properties props) {
        this.props = props;
    }


    @Override
    public String toString() {
        System.out.println(set.getClass());

        return "CollectionBean [array=" + Arrays.toString(array) + ", set=" + set + ", map=" + map + ", props=" + props
                + "]";
    }


   
    
    
}
