// 函数: _ZN14ascensionrules53CStateMayDiscardFanaticTrophyToSaveDestroyedConstruct10FixupCloneER13CStateMachine
// 地址: 0x141b98
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r2 = *(arg1 + 0x28)

if (r2 != 0)
    int32_t r1_1 = *(r2 + 0x250)
    
    if (r1_1 != 0)
        int32_t r0_2 = (*(*arg1 + 0x2c))(arg1, r1_1)
        r2 = *(arg1 + 0x28)
        *(arg1 + 0x250) = r0_2

int32_t result = *(r2 + 0x38)

if (result s< 1)
    return result

jump(*(*arg1 + 8))
