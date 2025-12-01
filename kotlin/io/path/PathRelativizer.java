package kotlin.io.path;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004R\u0016\u0010\u0003\u001A\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001A\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", "path", "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 5, 1})
final class PathRelativizer {
    public static final PathRelativizer INSTANCE;
    private static final Path emptyPath;
    private static final Path parentPath;

    static {
        PathRelativizer.INSTANCE = new PathRelativizer();
        PathRelativizer.emptyPath = Paths.get("", new String[0]);
        PathRelativizer.parentPath = Paths.get("..", new String[0]);
    }

    public final Path tryRelativeTo(Path path0, Path path1) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(path1, "base");
        Path path2 = path1.normalize();
        Path path3 = path0.normalize();
        Path path4 = path2.relativize(path3);
        Intrinsics.checkNotNullExpressionValue(path2, "bn");
        int v = path2.getNameCount();
        Intrinsics.checkNotNullExpressionValue(path3, "pn");
        int v1 = Math.min(v, path3.getNameCount());
        for(int v2 = 0; v2 < v1; ++v2) {
            Path path5 = path2.getName(v2);
            Path path6 = PathRelativizer.parentPath;
            if(!Intrinsics.areEqual(path5, path6) != 0) {
                break;
            }
            if(!Intrinsics.areEqual(path3.getName(v2), path6) != 0) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if(!Intrinsics.areEqual(path3, path2) == 0 || !Intrinsics.areEqual(path2, PathRelativizer.emptyPath)) {
            String s = path4.toString();
            Intrinsics.checkNotNullExpressionValue(path4, "rn");
            FileSystem fileSystem0 = path4.getFileSystem();
            Intrinsics.checkNotNullExpressionValue(fileSystem0, "rn.fileSystem");
            String s1 = fileSystem0.getSeparator();
            Intrinsics.checkNotNullExpressionValue(s1, "rn.fileSystem.separator");
            if(StringsKt.endsWith$default(s, s1, false, 2, null)) {
                FileSystem fileSystem1 = path4.getFileSystem();
                FileSystem fileSystem2 = path4.getFileSystem();
                Intrinsics.checkNotNullExpressionValue(fileSystem2, "rn.fileSystem");
                path3 = fileSystem1.getPath(StringsKt.dropLast(s, fileSystem2.getSeparator().length()), new String[0]);
            }
            else {
                path3 = path4;
            }
        }
        Intrinsics.checkNotNullExpressionValue(path3, "r");
        return path3;
    }
}

