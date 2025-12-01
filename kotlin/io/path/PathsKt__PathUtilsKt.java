package kotlin.io.path;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u00B2\u0001\n\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0011\u0010\u0016\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0001H\u0087\b\u001A*\u0010\u0016\u001A\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u00012\u0012\u0010\u0019\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001A\"\u00020\u0001H\u0087\b\u00A2\u0006\u0002\u0010\u001B\u001A?\u0010\u001C\u001A\u00020\u00022\b\u0010\u001D\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u00012\u001A\u0010\u001F\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001A\"\u0006\u0012\u0002\b\u00030 H\u0007\u00A2\u0006\u0002\u0010!\u001A6\u0010\u001C\u001A\u00020\u00022\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u00012\u001A\u0010\u001F\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001A\"\u0006\u0012\u0002\b\u00030 H\u0087\b\u00A2\u0006\u0002\u0010\"\u001AK\u0010#\u001A\u00020\u00022\b\u0010\u001D\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001A\u0004\u0018\u00010\u00012\u001A\u0010\u001F\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001A\"\u0006\u0012\u0002\b\u00030 H\u0007\u00A2\u0006\u0002\u0010%\u001AB\u0010#\u001A\u00020\u00022\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001A\u0004\u0018\u00010\u00012\u001A\u0010\u001F\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001A\"\u0006\u0012\u0002\b\u00030 H\u0087\b\u00A2\u0006\u0002\u0010&\u001A\u001C\u0010\'\u001A\u00020(2\u0006\u0010\u0017\u001A\u00020\u00022\n\u0010)\u001A\u0006\u0012\u0002\b\u00030*H\u0001\u001A\r\u0010+\u001A\u00020\u0002*\u00020\u0002H\u0087\b\u001A\r\u0010,\u001A\u00020\u0001*\u00020\u0002H\u0087\b\u001A.\u0010-\u001A\u00020\u0002*\u00020\u00022\u0006\u0010.\u001A\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u0002000\u001A\"\u000200H\u0087\b\u00A2\u0006\u0002\u00101\u001A\u001F\u0010-\u001A\u00020\u0002*\u00020\u00022\u0006\u0010.\u001A\u00020\u00022\b\b\u0002\u00102\u001A\u000203H\u0087\b\u001A.\u00104\u001A\u00020\u0002*\u00020\u00022\u001A\u0010\u001F\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001A\"\u0006\u0012\u0002\b\u00030 H\u0087\b\u00A2\u0006\u0002\u00105\u001A.\u00106\u001A\u00020\u0002*\u00020\u00022\u001A\u0010\u001F\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001A\"\u0006\u0012\u0002\b\u00030 H\u0087\b\u00A2\u0006\u0002\u00105\u001A.\u00107\u001A\u00020\u0002*\u00020\u00022\u001A\u0010\u001F\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001A\"\u0006\u0012\u0002\b\u00030 H\u0087\b\u00A2\u0006\u0002\u00105\u001A\u0015\u00108\u001A\u00020\u0002*\u00020\u00022\u0006\u0010.\u001A\u00020\u0002H\u0087\b\u001A6\u00109\u001A\u00020\u0002*\u00020\u00022\u0006\u0010.\u001A\u00020\u00022\u001A\u0010\u001F\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001A\"\u0006\u0012\u0002\b\u00030 H\u0087\b\u00A2\u0006\u0002\u0010:\u001A\r\u0010;\u001A\u00020<*\u00020\u0002H\u0087\b\u001A\r\u0010=\u001A\u000203*\u00020\u0002H\u0087\b\u001A\u0015\u0010>\u001A\u00020\u0002*\u00020\u00022\u0006\u0010?\u001A\u00020\u0002H\u0087\n\u001A\u0015\u0010>\u001A\u00020\u0002*\u00020\u00022\u0006\u0010?\u001A\u00020\u0001H\u0087\n\u001A&\u0010@\u001A\u000203*\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010B\u001A2\u0010C\u001A\u0002HD\"\n\b\u0000\u0010D\u0018\u0001*\u00020E*\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010F\u001A4\u0010G\u001A\u0004\u0018\u0001HD\"\n\b\u0000\u0010D\u0018\u0001*\u00020E*\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010F\u001A\r\u0010H\u001A\u00020I*\u00020\u0002H\u0087\b\u001A\r\u0010J\u001A\u00020K*\u00020\u0002H\u0087\b\u001A.\u0010L\u001A\u00020<*\u00020\u00022\b\b\u0002\u0010M\u001A\u00020\u00012\u0012\u0010N\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020<0OH\u0087\b\u00F8\u0001\u0000\u001A0\u0010P\u001A\u0004\u0018\u00010Q*\u00020\u00022\u0006\u0010R\u001A\u00020\u00012\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010S\u001A&\u0010T\u001A\u00020U*\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010V\u001A(\u0010W\u001A\u0004\u0018\u00010X*\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010Y\u001A,\u0010Z\u001A\b\u0012\u0004\u0012\u00020\\0[*\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010]\u001A&\u0010^\u001A\u000203*\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010B\u001A\r\u0010_\u001A\u000203*\u00020\u0002H\u0087\b\u001A\r\u0010`\u001A\u000203*\u00020\u0002H\u0087\b\u001A\r\u0010a\u001A\u000203*\u00020\u0002H\u0087\b\u001A&\u0010b\u001A\u000203*\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010B\u001A\u0015\u0010c\u001A\u000203*\u00020\u00022\u0006\u0010?\u001A\u00020\u0002H\u0087\b\u001A\r\u0010d\u001A\u000203*\u00020\u0002H\u0087\b\u001A\r\u0010e\u001A\u000203*\u00020\u0002H\u0087\b\u001A\u001C\u0010f\u001A\b\u0012\u0004\u0012\u00020\u00020g*\u00020\u00022\b\b\u0002\u0010M\u001A\u00020\u0001H\u0007\u001A.\u0010h\u001A\u00020\u0002*\u00020\u00022\u0006\u0010.\u001A\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u0002000\u001A\"\u000200H\u0087\b\u00A2\u0006\u0002\u00101\u001A\u001F\u0010h\u001A\u00020\u0002*\u00020\u00022\u0006\u0010.\u001A\u00020\u00022\b\b\u0002\u00102\u001A\u000203H\u0087\b\u001A&\u0010i\u001A\u000203*\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010B\u001A2\u0010j\u001A\u0002Hk\"\n\b\u0000\u0010k\u0018\u0001*\u00020l*\u00020\u00022\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010m\u001A<\u0010j\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010Q0n*\u00020\u00022\u0006\u0010\u001F\u001A\u00020\u00012\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010o\u001A\r\u0010p\u001A\u00020\u0002*\u00020\u0002H\u0087\b\u001A\u0014\u0010q\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u0002H\u0007\u001A\u0016\u0010r\u001A\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u0002H\u0007\u001A\u0014\u0010s\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u0002H\u0007\u001A8\u0010t\u001A\u00020\u0002*\u00020\u00022\u0006\u0010R\u001A\u00020\u00012\b\u0010u\u001A\u0004\u0018\u00010Q2\u0012\u0010/\u001A\n\u0012\u0006\b\u0001\u0012\u00020A0\u001A\"\u00020AH\u0087\b\u00A2\u0006\u0002\u0010v\u001A\u0015\u0010w\u001A\u00020\u0002*\u00020\u00022\u0006\u0010u\u001A\u00020UH\u0087\b\u001A\u0015\u0010x\u001A\u00020\u0002*\u00020\u00022\u0006\u0010u\u001A\u00020XH\u0087\b\u001A\u001B\u0010y\u001A\u00020\u0002*\u00020\u00022\f\u0010u\u001A\b\u0012\u0004\u0012\u00020\\0[H\u0087\b\u001A\r\u0010z\u001A\u00020\u0002*\u00020{H\u0087\b\u001A@\u0010|\u001A\u0002H}\"\u0004\b\u0000\u0010}*\u00020\u00022\b\b\u0002\u0010M\u001A\u00020\u00012\u0018\u0010~\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u007F\u0012\u0004\u0012\u0002H}0OH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0003\u0010\u0080\u0001\"\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u001F\u0010\u0007\u001A\u00020\u0001*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006\"\u001E\u0010\n\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006\"\u001E\u0010\r\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006\"\u001E\u0010\u0010\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006\"\u001F\u0010\u0013\u001A\u00020\u0001*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0014\u0010\u0004\u001A\u0004\b\u0015\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006\u0081\u0001"}, d2 = {"extension", "", "Ljava/nio/file/Path;", "getExtension$annotations", "(Ljava/nio/file/Path;)V", "getExtension", "(Ljava/nio/file/Path;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath$annotations", "getInvariantSeparatorsPath", "invariantSeparatorsPathString", "getInvariantSeparatorsPathString$annotations", "getInvariantSeparatorsPathString", "name", "getName$annotations", "getName", "nameWithoutExtension", "getNameWithoutExtension$annotations", "getNameWithoutExtension", "pathString", "getPathString$annotations", "getPathString", "Path", "path", "base", "subpaths", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "createTempDirectory", "directory", "prefix", "attributes", "Ljava/nio/file/attribute/FileAttribute;", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createTempFile", "suffix", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "fileAttributeViewNotAvailable", "", "attributeViewClass", "Ljava/lang/Class;", "absolute", "absolutePathString", "copyTo", "target", "options", "Ljava/nio/file/CopyOption;", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "overwrite", "", "createDirectories", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createDirectory", "createFile", "createLinkPointingTo", "createSymbolicLinkPointingTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "deleteExisting", "", "deleteIfExists", "div", "other", "exists", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "fileAttributesView", "V", "Ljava/nio/file/attribute/FileAttributeView;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "fileAttributesViewOrNull", "fileSize", "", "fileStore", "Ljava/nio/file/FileStore;", "forEachDirectoryEntry", "glob", "action", "Lkotlin/Function1;", "getAttribute", "", "attribute", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "getLastModifiedTime", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "getOwner", "Ljava/nio/file/attribute/UserPrincipal;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "getPosixFilePermissions", "", "Ljava/nio/file/attribute/PosixFilePermission;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "isDirectory", "isExecutable", "isHidden", "isReadable", "isRegularFile", "isSameFileAs", "isSymbolicLink", "isWritable", "listDirectoryEntries", "", "moveTo", "notExists", "readAttributes", "A", "Ljava/nio/file/attribute/BasicFileAttributes;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "readSymbolicLink", "relativeTo", "relativeToOrNull", "relativeToOrSelf", "setAttribute", "value", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "setLastModifiedTime", "setOwner", "setPosixFilePermissions", "toPath", "Ljava/net/URI;", "useDirectoryEntries", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/io/path/PathsKt")
class PathsKt__PathUtilsKt extends PathsKt__PathReadWriteKt {
    private static final Path Path(String s) {
        Path path0 = Paths.get(s, new String[0]);
        Intrinsics.checkNotNullExpressionValue(path0, "Paths.get(path)");
        return path0;
    }

    private static final Path Path(String s, String[] arr_s) {
        Path path0 = Paths.get(s, ((String[])Arrays.copyOf(arr_s, arr_s.length)));
        Intrinsics.checkNotNullExpressionValue(path0, "Paths.get(base, *subpaths)");
        return path0;
    }

    private static final Path absolute(Path path0) {
        Path path1 = path0.toAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(path1, "toAbsolutePath()");
        return path1;
    }

    private static final String absolutePathString(Path path0) {
        return path0.toAbsolutePath().toString();
    }

    private static final Path copyTo(Path path0, Path path1, boolean z) throws IOException {
        CopyOption[] arr_copyOption = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path path2 = Files.copy(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        Intrinsics.checkNotNullExpressionValue(path2, "Files.copy(this, target, *options)");
        return path2;
    }

    private static final Path copyTo(Path path0, Path path1, CopyOption[] arr_copyOption) throws IOException {
        Path path2 = Files.copy(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        Intrinsics.checkNotNullExpressionValue(path2, "Files.copy(this, target, *options)");
        return path2;
    }

    static Path copyTo$default(Path path0, Path path1, boolean z, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            z = false;
        }
        CopyOption[] arr_copyOption = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path path2 = Files.copy(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        Intrinsics.checkNotNullExpressionValue(path2, "Files.copy(this, target, *options)");
        return path2;
    }

    private static final Path createDirectories(Path path0, FileAttribute[] arr_fileAttribute) throws IOException {
        Path path1 = Files.createDirectories(path0, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path1, "Files.createDirectories(this, *attributes)");
        return path1;
    }

    private static final Path createDirectory(Path path0, FileAttribute[] arr_fileAttribute) throws IOException {
        Path path1 = Files.createDirectory(path0, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path1, "Files.createDirectory(this, *attributes)");
        return path1;
    }

    private static final Path createFile(Path path0, FileAttribute[] arr_fileAttribute) throws IOException {
        Path path1 = Files.createFile(path0, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path1, "Files.createFile(this, *attributes)");
        return path1;
    }

    private static final Path createLinkPointingTo(Path path0, Path path1) throws IOException {
        Path path2 = Files.createLink(path0, path1);
        Intrinsics.checkNotNullExpressionValue(path2, "Files.createLink(this, target)");
        return path2;
    }

    private static final Path createSymbolicLinkPointingTo(Path path0, Path path1, FileAttribute[] arr_fileAttribute) throws IOException {
        Path path2 = Files.createSymbolicLink(path0, path1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path2, "Files.createSymbolicLink…his, target, *attributes)");
        return path2;
    }

    private static final Path createTempDirectory(String s, FileAttribute[] arr_fileAttribute) throws IOException {
        Path path0 = Files.createTempDirectory(s, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path0, "Files.createTempDirectory(prefix, *attributes)");
        return path0;
    }

    public static final Path createTempDirectory(Path path0, String s, FileAttribute[] arr_fileAttribute) throws IOException {
        Path path1;
        Intrinsics.checkNotNullParameter(arr_fileAttribute, "attributes");
        if(path0 != null) {
            path1 = Files.createTempDirectory(path0, s, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
            Intrinsics.checkNotNullExpressionValue(path1, "Files.createTempDirector…ory, prefix, *attributes)");
            return path1;
        }
        path1 = Files.createTempDirectory(s, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path1, "Files.createTempDirectory(prefix, *attributes)");
        return path1;
    }

    static Path createTempDirectory$default(String s, FileAttribute[] arr_fileAttribute, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            s = null;
        }
        Path path0 = Files.createTempDirectory(s, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path0, "Files.createTempDirectory(prefix, *attributes)");
        return path0;
    }

    public static Path createTempDirectory$default(Path path0, String s, FileAttribute[] arr_fileAttribute, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            s = null;
        }
        return PathsKt.createTempDirectory(path0, s, arr_fileAttribute);
    }

    private static final Path createTempFile(String s, String s1, FileAttribute[] arr_fileAttribute) throws IOException {
        Path path0 = Files.createTempFile(s, s1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path0, "Files.createTempFile(prefix, suffix, *attributes)");
        return path0;
    }

    public static final Path createTempFile(Path path0, String s, String s1, FileAttribute[] arr_fileAttribute) throws IOException {
        Path path1;
        Intrinsics.checkNotNullParameter(arr_fileAttribute, "attributes");
        if(path0 != null) {
            path1 = Files.createTempFile(path0, s, s1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
            Intrinsics.checkNotNullExpressionValue(path1, "Files.createTempFile(dir…fix, suffix, *attributes)");
            return path1;
        }
        path1 = Files.createTempFile(s, s1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path1, "Files.createTempFile(prefix, suffix, *attributes)");
        return path1;
    }

    static Path createTempFile$default(String s, String s1, FileAttribute[] arr_fileAttribute, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        Path path0 = Files.createTempFile(s, s1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path0, "Files.createTempFile(prefix, suffix, *attributes)");
        return path0;
    }

    public static Path createTempFile$default(Path path0, String s, String s1, FileAttribute[] arr_fileAttribute, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        return PathsKt.createTempFile(path0, s, s1, arr_fileAttribute);
    }

    private static final void deleteExisting(Path path0) throws IOException {
        Files.delete(path0);
    }

    private static final boolean deleteIfExists(Path path0) throws IOException {
        return Files.deleteIfExists(path0);
    }

    private static final Path div(Path path0, String s) {
        Intrinsics.checkNotNullParameter(path0, "$this$div");
        Path path1 = path0.resolve(s);
        Intrinsics.checkNotNullExpressionValue(path1, "this.resolve(other)");
        return path1;
    }

    private static final Path div(Path path0, Path path1) {
        Intrinsics.checkNotNullParameter(path0, "$this$div");
        Path path2 = path0.resolve(path1);
        Intrinsics.checkNotNullExpressionValue(path2, "this.resolve(other)");
        return path2;
    }

    private static final boolean exists(Path path0, LinkOption[] arr_linkOption) {
        return Files.exists(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    public static final Void fileAttributeViewNotAvailable(Path path0, Class class0) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(class0, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + class0 + " is not available for the file " + path0 + '.');
    }

    private static final FileAttributeView fileAttributesView(Path path0, LinkOption[] arr_linkOption) {
        Intrinsics.reifiedOperationMarker(4, "V");
        LinkOption[] arr_linkOption1 = (LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
        FileAttributeView fileAttributeView0 = Files.getFileAttributeView(path0, FileAttributeView.class, arr_linkOption1);
        if(fileAttributeView0 != null) {
            return fileAttributeView0;
        }
        Intrinsics.reifiedOperationMarker(4, "V");
        PathsKt.fileAttributeViewNotAvailable(path0, FileAttributeView.class);
        throw new KotlinNothingValueException();
    }

    private static final FileAttributeView fileAttributesViewOrNull(Path path0, LinkOption[] arr_linkOption) {
        Intrinsics.reifiedOperationMarker(4, "V");
        LinkOption[] arr_linkOption1 = (LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
        return Files.getFileAttributeView(path0, FileAttributeView.class, arr_linkOption1);
    }

    private static final long fileSize(Path path0) throws IOException {
        return Files.size(path0);
    }

    private static final FileStore fileStore(Path path0) throws IOException {
        FileStore fileStore0 = Files.getFileStore(path0);
        Intrinsics.checkNotNullExpressionValue(fileStore0, "Files.getFileStore(this)");
        return fileStore0;
    }

    private static final void forEachDirectoryEntry(Path path0, String s, Function1 function10) throws IOException {
        Closeable closeable0 = Files.newDirectoryStream(path0, s);
        try {
            Intrinsics.checkNotNullExpressionValue(((DirectoryStream)closeable0), "it");
            for(Object object0: ((DirectoryStream)closeable0)) {
                function10.invoke(object0);
            }
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(closeable0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(closeable0, null);
    }

    static void forEachDirectoryEntry$default(Path path0, String s, Function1 function10, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            s = "*";
        }
        Closeable closeable0 = Files.newDirectoryStream(path0, s);
        try {
            Intrinsics.checkNotNullExpressionValue(((DirectoryStream)closeable0), "it");
            for(Object object1: ((DirectoryStream)closeable0)) {
                function10.invoke(object1);
            }
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(closeable0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(closeable0, null);
    }

    private static final Object getAttribute(Path path0, String s, LinkOption[] arr_linkOption) throws IOException {
        return Files.getAttribute(path0, s, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    public static final String getExtension(Path path0) {
        Intrinsics.checkNotNullParameter(path0, "$this$extension");
        Path path1 = path0.getFileName();
        if(path1 != null) {
            String s = path1.toString();
            if(s != null) {
                String s1 = StringsKt.substringAfterLast(s, '.', "");
                return s1 == null ? "" : s1;
            }
        }
        return "";
    }

    public static void getExtension$annotations(Path path0) {
    }

    private static final String getInvariantSeparatorsPath(Path path0) {
        return PathsKt.getInvariantSeparatorsPathString(path0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    public static void getInvariantSeparatorsPath$annotations(Path path0) {
    }

    public static final String getInvariantSeparatorsPathString(Path path0) {
        Intrinsics.checkNotNullParameter(path0, "$this$invariantSeparatorsPathString");
        FileSystem fileSystem0 = path0.getFileSystem();
        Intrinsics.checkNotNullExpressionValue(fileSystem0, "fileSystem");
        String s = fileSystem0.getSeparator();
        if(!Intrinsics.areEqual(s, "/") != 0) {
            Intrinsics.checkNotNullExpressionValue(s, "separator");
            return StringsKt.replace$default(path0.toString(), s, "/", false, 4, null);
        }
        return path0.toString();
    }

    public static void getInvariantSeparatorsPathString$annotations(Path path0) {
    }

    private static final FileTime getLastModifiedTime(Path path0, LinkOption[] arr_linkOption) throws IOException {
        FileTime fileTime0 = Files.getLastModifiedTime(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
        Intrinsics.checkNotNullExpressionValue(fileTime0, "Files.getLastModifiedTime(this, *options)");
        return fileTime0;
    }

    public static final String getName(Path path0) {
        Intrinsics.checkNotNullParameter(path0, "$this$name");
        Path path1 = path0.getFileName();
        String s = path1 == null ? null : path1.toString();
        return s == null ? "" : s;
    }

    public static void getName$annotations(Path path0) {
    }

    public static final String getNameWithoutExtension(Path path0) {
        Intrinsics.checkNotNullParameter(path0, "$this$nameWithoutExtension");
        Path path1 = path0.getFileName();
        if(path1 != null) {
            String s = path1.toString();
            if(s != null) {
                String s1 = StringsKt.substringBeforeLast$default(s, ".", null, 2, null);
                return s1 == null ? "" : s1;
            }
        }
        return "";
    }

    public static void getNameWithoutExtension$annotations(Path path0) {
    }

    private static final UserPrincipal getOwner(Path path0, LinkOption[] arr_linkOption) throws IOException {
        return Files.getOwner(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    private static final String getPathString(Path path0) {
        return path0.toString();
    }

    public static void getPathString$annotations(Path path0) {
    }

    private static final Set getPosixFilePermissions(Path path0, LinkOption[] arr_linkOption) throws IOException {
        Set set0 = Files.getPosixFilePermissions(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
        Intrinsics.checkNotNullExpressionValue(set0, "Files.getPosixFilePermissions(this, *options)");
        return set0;
    }

    private static final boolean isDirectory(Path path0, LinkOption[] arr_linkOption) {
        return Files.isDirectory(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    private static final boolean isExecutable(Path path0) {
        return Files.isExecutable(path0);
    }

    private static final boolean isHidden(Path path0) throws IOException {
        return Files.isHidden(path0);
    }

    private static final boolean isReadable(Path path0) {
        return Files.isReadable(path0);
    }

    private static final boolean isRegularFile(Path path0, LinkOption[] arr_linkOption) {
        return Files.isRegularFile(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    private static final boolean isSameFileAs(Path path0, Path path1) throws IOException {
        return Files.isSameFile(path0, path1);
    }

    private static final boolean isSymbolicLink(Path path0) {
        return Files.isSymbolicLink(path0);
    }

    private static final boolean isWritable(Path path0) {
        return Files.isWritable(path0);
    }

    public static final List listDirectoryEntries(Path path0, String s) throws IOException {
        List list0;
        Intrinsics.checkNotNullParameter(path0, "$this$listDirectoryEntries");
        Intrinsics.checkNotNullParameter(s, "glob");
        Closeable closeable0 = Files.newDirectoryStream(path0, s);
        try {
            Intrinsics.checkNotNullExpressionValue(((DirectoryStream)closeable0), "it");
            list0 = CollectionsKt.toList(((DirectoryStream)closeable0));
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(closeable0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(closeable0, null);
        return list0;
    }

    public static List listDirectoryEntries$default(Path path0, String s, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            s = "*";
        }
        return PathsKt.listDirectoryEntries(path0, s);
    }

    private static final Path moveTo(Path path0, Path path1, boolean z) throws IOException {
        CopyOption[] arr_copyOption = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path path2 = Files.move(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        Intrinsics.checkNotNullExpressionValue(path2, "Files.move(this, target, *options)");
        return path2;
    }

    private static final Path moveTo(Path path0, Path path1, CopyOption[] arr_copyOption) throws IOException {
        Path path2 = Files.move(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        Intrinsics.checkNotNullExpressionValue(path2, "Files.move(this, target, *options)");
        return path2;
    }

    static Path moveTo$default(Path path0, Path path1, boolean z, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            z = false;
        }
        CopyOption[] arr_copyOption = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path path2 = Files.move(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        Intrinsics.checkNotNullExpressionValue(path2, "Files.move(this, target, *options)");
        return path2;
    }

    private static final boolean notExists(Path path0, LinkOption[] arr_linkOption) {
        return Files.notExists(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    private static final BasicFileAttributes readAttributes(Path path0, LinkOption[] arr_linkOption) throws IOException {
        Intrinsics.reifiedOperationMarker(4, "A");
        LinkOption[] arr_linkOption1 = (LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
        BasicFileAttributes basicFileAttributes0 = Files.readAttributes(path0, BasicFileAttributes.class, arr_linkOption1);
        Intrinsics.checkNotNullExpressionValue(basicFileAttributes0, "Files.readAttributes(thi… A::class.java, *options)");
        return basicFileAttributes0;
    }

    private static final Map readAttributes(Path path0, String s, LinkOption[] arr_linkOption) throws IOException {
        Map map0 = Files.readAttributes(path0, s, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
        Intrinsics.checkNotNullExpressionValue(map0, "Files.readAttributes(this, attributes, *options)");
        return map0;
    }

    private static final Path readSymbolicLink(Path path0) throws IOException {
        Path path1 = Files.readSymbolicLink(path0);
        Intrinsics.checkNotNullExpressionValue(path1, "Files.readSymbolicLink(this)");
        return path1;
    }

    public static final Path relativeTo(Path path0, Path path1) {
        Intrinsics.checkNotNullParameter(path0, "$this$relativeTo");
        Intrinsics.checkNotNullParameter(path1, "base");
        try {
            return PathRelativizer.INSTANCE.tryRelativeTo(path0, path1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(illegalArgumentException0.getMessage(), "\nthis path: " + path0 + "\nbase path: " + path1), illegalArgumentException0);
        }
    }

    public static final Path relativeToOrNull(Path path0, Path path1) {
        Intrinsics.checkNotNullParameter(path0, "$this$relativeToOrNull");
        Intrinsics.checkNotNullParameter(path1, "base");
        try {
            return PathRelativizer.INSTANCE.tryRelativeTo(path0, path1);
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }

    public static final Path relativeToOrSelf(Path path0, Path path1) {
        Intrinsics.checkNotNullParameter(path0, "$this$relativeToOrSelf");
        Intrinsics.checkNotNullParameter(path1, "base");
        Path path2 = PathsKt.relativeToOrNull(path0, path1);
        return path2 == null ? path0 : path2;
    }

    private static final Path setAttribute(Path path0, String s, Object object0, LinkOption[] arr_linkOption) throws IOException {
        Path path1 = Files.setAttribute(path0, s, object0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
        Intrinsics.checkNotNullExpressionValue(path1, "Files.setAttribute(this,…tribute, value, *options)");
        return path1;
    }

    private static final Path setLastModifiedTime(Path path0, FileTime fileTime0) throws IOException {
        Path path1 = Files.setLastModifiedTime(path0, fileTime0);
        Intrinsics.checkNotNullExpressionValue(path1, "Files.setLastModifiedTime(this, value)");
        return path1;
    }

    private static final Path setOwner(Path path0, UserPrincipal userPrincipal0) throws IOException {
        Path path1 = Files.setOwner(path0, userPrincipal0);
        Intrinsics.checkNotNullExpressionValue(path1, "Files.setOwner(this, value)");
        return path1;
    }

    private static final Path setPosixFilePermissions(Path path0, Set set0) throws IOException {
        Path path1 = Files.setPosixFilePermissions(path0, set0);
        Intrinsics.checkNotNullExpressionValue(path1, "Files.setPosixFilePermissions(this, value)");
        return path1;
    }

    private static final Path toPath(URI uRI0) {
        Path path0 = Paths.get(uRI0);
        Intrinsics.checkNotNullExpressionValue(path0, "Paths.get(this)");
        return path0;
    }

    private static final Object useDirectoryEntries(Path path0, String s, Function1 function10) throws IOException {
        Object object0;
        Closeable closeable0 = Files.newDirectoryStream(path0, s);
        try {
            Intrinsics.checkNotNullExpressionValue(((DirectoryStream)closeable0), "it");
            object0 = function10.invoke(CollectionsKt.asSequence(((DirectoryStream)closeable0)));
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(closeable0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(closeable0, null);
        return object0;
    }

    static Object useDirectoryEntries$default(Path path0, String s, Function1 function10, int v, Object object0) throws IOException {
        Object object1;
        if((v & 1) != 0) {
            s = "*";
        }
        Closeable closeable0 = Files.newDirectoryStream(path0, s);
        try {
            Intrinsics.checkNotNullExpressionValue(((DirectoryStream)closeable0), "it");
            object1 = function10.invoke(CollectionsKt.asSequence(((DirectoryStream)closeable0)));
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(closeable0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(closeable0, null);
        return object1;
    }
}

