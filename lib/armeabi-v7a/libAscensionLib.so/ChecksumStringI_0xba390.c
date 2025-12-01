// 函数: ChecksumStringI
// 地址: 0xba390
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (arg1 != 0)
    uint32_t i = zx.d(*arg1)
    
    if (i != 0)
        void* r5_1 = &arg1[1]
        result = 0
        
        do
            char r0_2 = tolower(i << 0xfffffffc s>> 0x18) ^ result.b
            i = zx.d(*r5_1)
            r5_1 += 1
            result = *(&data_1d0bd0 + (zx.d(r0_2) << 2)) ^ result u>> 8
        while (i != 0)

return result
