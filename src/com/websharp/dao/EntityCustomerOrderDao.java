package com.websharp.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.websharp.dao.EntityCustomerOrder;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ENTITY_CUSTOMER_ORDER.
*/
public class EntityCustomerOrderDao extends AbstractDao<EntityCustomerOrder, Void> {

    public static final String TABLENAME = "ENTITY_CUSTOMER_ORDER";

    /**
     * Properties of entity EntityCustomerOrder.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property CUST_ORDER_ID = new Property(0, String.class, "CUST_ORDER_ID", false, "CUST__ORDER__ID");
        public final static Property PROD_ORDER_ID = new Property(1, String.class, "PROD_ORDER_ID", false, "PROD__ORDER__ID");
        public final static Property BUSI_NAME = new Property(2, String.class, "BUSI_NAME", false, "BUSI__NAME");
        public final static Property ORGANIZE_NAME = new Property(3, String.class, "ORGANIZE_NAME", false, "ORGANIZE__NAME");
        public final static Property STAFF_NAME = new Property(4, String.class, "STAFF_NAME", false, "STAFF__NAME");
        public final static Property DEV_NAME = new Property(5, String.class, "DEV_NAME", false, "DEV__NAME");
        public final static Property PAY_TYPE = new Property(6, String.class, "PAY_TYPE", false, "PAY__TYPE");
        public final static Property CREATE_DATE = new Property(7, String.class, "CREATE_DATE", false, "CREATE__DATE");
        public final static Property REMARK = new Property(8, String.class, "REMARK", false, "REMARK");
        public final static Property ORDER_STATE = new Property(9, String.class, "ORDER_STATE", false, "ORDER__STATE");
    };


    public EntityCustomerOrderDao(DaoConfig config) {
        super(config);
    }
    
    public EntityCustomerOrderDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ENTITY_CUSTOMER_ORDER' (" + //
                "'CUST__ORDER__ID' TEXT," + // 0: CUST_ORDER_ID
                "'PROD__ORDER__ID' TEXT," + // 1: PROD_ORDER_ID
                "'BUSI__NAME' TEXT," + // 2: BUSI_NAME
                "'ORGANIZE__NAME' TEXT," + // 3: ORGANIZE_NAME
                "'STAFF__NAME' TEXT," + // 4: STAFF_NAME
                "'DEV__NAME' TEXT," + // 5: DEV_NAME
                "'PAY__TYPE' TEXT," + // 6: PAY_TYPE
                "'CREATE__DATE' TEXT," + // 7: CREATE_DATE
                "'REMARK' TEXT," + // 8: REMARK
                "'ORDER__STATE' TEXT);"); // 9: ORDER_STATE
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ENTITY_CUSTOMER_ORDER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, EntityCustomerOrder entity) {
        stmt.clearBindings();
 
        String CUST_ORDER_ID = entity.getCUST_ORDER_ID();
        if (CUST_ORDER_ID != null) {
            stmt.bindString(1, CUST_ORDER_ID);
        }
 
        String PROD_ORDER_ID = entity.getPROD_ORDER_ID();
        if (PROD_ORDER_ID != null) {
            stmt.bindString(2, PROD_ORDER_ID);
        }
 
        String BUSI_NAME = entity.getBUSI_NAME();
        if (BUSI_NAME != null) {
            stmt.bindString(3, BUSI_NAME);
        }
 
        String ORGANIZE_NAME = entity.getORGANIZE_NAME();
        if (ORGANIZE_NAME != null) {
            stmt.bindString(4, ORGANIZE_NAME);
        }
 
        String STAFF_NAME = entity.getSTAFF_NAME();
        if (STAFF_NAME != null) {
            stmt.bindString(5, STAFF_NAME);
        }
 
        String DEV_NAME = entity.getDEV_NAME();
        if (DEV_NAME != null) {
            stmt.bindString(6, DEV_NAME);
        }
 
        String PAY_TYPE = entity.getPAY_TYPE();
        if (PAY_TYPE != null) {
            stmt.bindString(7, PAY_TYPE);
        }
 
        String CREATE_DATE = entity.getCREATE_DATE();
        if (CREATE_DATE != null) {
            stmt.bindString(8, CREATE_DATE);
        }
 
        String REMARK = entity.getREMARK();
        if (REMARK != null) {
            stmt.bindString(9, REMARK);
        }
 
        String ORDER_STATE = entity.getORDER_STATE();
        if (ORDER_STATE != null) {
            stmt.bindString(10, ORDER_STATE);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public EntityCustomerOrder readEntity(Cursor cursor, int offset) {
        EntityCustomerOrder entity = new EntityCustomerOrder( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // CUST_ORDER_ID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // PROD_ORDER_ID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // BUSI_NAME
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ORGANIZE_NAME
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // STAFF_NAME
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // DEV_NAME
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // PAY_TYPE
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // CREATE_DATE
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // REMARK
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // ORDER_STATE
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, EntityCustomerOrder entity, int offset) {
        entity.setCUST_ORDER_ID(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setPROD_ORDER_ID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBUSI_NAME(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setORGANIZE_NAME(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSTAFF_NAME(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDEV_NAME(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPAY_TYPE(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCREATE_DATE(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setREMARK(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setORDER_STATE(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(EntityCustomerOrder entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(EntityCustomerOrder entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
