package com.bm.model;

public class BSort {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_sort.id
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_sort.sort_name
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    private String sortName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_sort.id
     *
     * @return the value of b_sort.id
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_sort.id
     *
     * @param id the value for b_sort.id
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_sort.sort_name
     *
     * @return the value of b_sort.sort_name
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_sort.sort_name
     *
     * @param sortName the value for b_sort.sort_name
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    public void setSortName(String sortName) {
        this.sortName = sortName == null ? null : sortName.trim();
    }
}