package datart.security.base;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder
public class Permission{

    private String orgId;

    private String resourceType;

    private String resourceId;

    private int permission;

    @Override
    public String toString() {
        return "Permission{" +
                "resourceType='" + resourceType + '\'' +
                ", orgId='" + orgId + '\'' +
                ", resourceId='" + resourceId + '\'' +
                ", permission=" + permission +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permission that = (Permission) o;
        return permission == that.permission && orgId.equals(that.orgId) && resourceType.equals(that.resourceType) && resourceId.equals(that.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgId, resourceType, resourceId, permission);
    }
}