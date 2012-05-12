package codigolimpo;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.usertype.UserType;

public abstract class ImmutableUserType implements UserType, Serializable {

private static final long serialVersionUID = 1L;

@Override
public Object assemble(Serializable cached, Object owner) throws HibernateException {
return deepCopy(cached);
}

@Override
public Object deepCopy(Object value) throws HibernateException {
return value;
}

@Override
public Serializable disassemble(Object value) throws HibernateException {
return (Serializable) deepCopy(value);
}

@Override
public boolean equals(Object x, Object y) throws HibernateException {
if (x == y) {
return true;
}
if (x == null || y == null) {
return false;
}
return x.equals(y);
}

@Override
public int hashCode(Object x) throws HibernateException {
return x.hashCode();
}

@Override
public boolean isMutable() {
return false;
}

@Override
public Object replace(Object original, Object target, Object owner) throws HibernateException {
return deepCopy(original);
}

}