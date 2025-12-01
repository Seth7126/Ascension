// 函数: _ZN14ascensionrules30CStatePutConstructOnCenterDeck10FixupCloneER13CStateMachine
// 地址: 0x141088
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x28)

if (r0 != 0)
    int32_t r1_1 = *(r0 + 0x250)
    
    if (r1_1 != 0)
        int32_t r0_3 = (*(*arg1 + 0x2c))(arg1, r1_1)
        *(arg1 + 0x250) = r0_3
        return r0_3

return r0
