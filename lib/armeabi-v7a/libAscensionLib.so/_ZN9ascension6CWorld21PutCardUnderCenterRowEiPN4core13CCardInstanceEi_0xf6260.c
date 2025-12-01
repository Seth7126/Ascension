// 函数: _ZN9ascension6CWorld21PutCardUnderCenterRowEiPN4core13CCardInstanceEi
// 地址: 0xf6260
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg2 s< 0 || arg3 == 0)
    return 

int32_t r7_1 = arg1
arg1 = *(arg1 + 0xa40)

if ((*(r7_1 + 0xa44) - arg1) s>> 2 s<= arg2)
    return 

if (*(*(arg3 + 0xc) + 0x88) == 8)
    ascension::CWorld::AssignPortalCard(r7_1)
    arg1 = *(r7_1 + 0xa40)

return ascension::CCenterRowInstance::PutCardUnder(*(arg1 + (arg2 << 2)), arg3) __tailcall
