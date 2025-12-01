// 函数: _ZN14ascensionrules30CStatePutDefeatedMonsterInVoid10EnterStateER13CStateMachine
// 地址: 0x1575b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r2 = *(arg1 + 0x38)
uint32_t result = zx.d(*(r2 + 0x64))

if (result == 0)
    return result

int32_t var_18 = 0
ascension::CWorld::OutputAnimationCard(*(arg1 + 0x30), *(arg1 + 0x34), 4, 7, *(r2 + 0x58), 9, 0, 
    &__elf_header)
*(arg1 + 0x34)
return ascension::CWorld::PutCardInVoid(*(arg1 + 0x30)) __tailcall
