package com.aedms.core.entities;

import java.io.Serializable;
import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import java.util.Map;
import java.util.Set;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 *
 * @author jaly
 */
@BeanDefinition
public abstract class AedmsEntity implements Serializable, Bean {

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code AedmsEntity}.
     * @return the meta-bean, not null
     */
    public static AedmsEntity.Meta meta() {
        return AedmsEntity.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(AedmsEntity.Meta.INSTANCE);
    }

    /**
     * The serialization version id.
     */
    private static final long serialVersionUID = 1L;

    @Override
    public AedmsEntity.Meta metaBean() {
        return AedmsEntity.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    @Override
    public AedmsEntity clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(32);
        buf.append("AedmsEntity{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code AedmsEntity}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null);

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        public BeanBuilder<? extends AedmsEntity> builder() {
            throw new UnsupportedOperationException("AedmsEntity is an abstract class");
        }

        @Override
        public Class<? extends AedmsEntity> beanType() {
            return AedmsEntity.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}