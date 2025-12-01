// 函数: _ZNK9ascension6CWorld17IsCardInCenterRowEPN4core13CCardInstanceE
// 地址: 0xf6578
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg1 + 0xa40)

if (*(arg1 + 0xa44) == r1)
    return 0

int32_t i = 0

do
    if (ascension::CCenterRowInstance::IsCardInStackList(*(r1 + (i << 2))) != 0)
        return 1
    
    r1 = *(arg1 + 0xa40)
    i += 1
while (i u< (*(arg1 + 0xa44) - r1) s>> 2)

return 0
