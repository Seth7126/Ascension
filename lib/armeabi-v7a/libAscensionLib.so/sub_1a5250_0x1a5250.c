// 函数: sub_1a5250
// 地址: 0x1a5250
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0
int32_t r1

if (arg1 u< 0xd)
    char* r1_1
    
    if (arg2 == 0)
        r1_1 = zx.d(data_1e40a4)
    label_1a528a:
        
        if (r1_1 != 0)
            return "C.UTF-8"
        
        return &data_1c068f
    
    if (sub_1a51dc(arg2) != 0)
        r1_1 = sub_1a5230(arg2)
        data_1e40a4 = r1_1.b
        goto label_1a528a
    
    r0 = __errno()
    r1 = 2
else
    r0 = __errno()
    r1 = 0x16

*r0 = r1
return 0
