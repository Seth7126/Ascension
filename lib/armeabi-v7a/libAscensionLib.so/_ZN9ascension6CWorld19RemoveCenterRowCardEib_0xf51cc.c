// 函数: _ZN9ascension6CWorld19RemoveCenterRowCardEib
// 地址: 0xf51cc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 s>= 0)
    int32_t r3_1 = arg2
    int32_t r1 = *(arg1 + 0xa40)
    int32_t entry_r2
    
    if (r3_1 s< (*(arg1 + 0xa44) - r1) s>> 2)
        return ascension::CCenterRowInstance::RemoveTopCard((*(r1 + (r3_1 << 2))).b, entry_r2)
            __tailcall

return 0
