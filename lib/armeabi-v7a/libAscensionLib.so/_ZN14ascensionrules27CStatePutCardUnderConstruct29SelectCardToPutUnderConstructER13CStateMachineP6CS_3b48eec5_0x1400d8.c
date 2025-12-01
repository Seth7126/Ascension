// 函数: _ZN14ascensionrules27CStatePutCardUnderConstruct29SelectCardToPutUnderConstructER13CStateMachineP6CStateiPj
// 地址: 0x1400d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = *(arg2 + 0x24c)
core::CCardInstance* r8 = *(r6 + 4)
ascension::CPlayer::AddTurnLog(r6, 8)
core::CWorldBase::OutputMessageFormat(r8, "%s puts %s under %s\n", r6 + 0x10, 
    (*(*arg3 + 0xc))(arg3), (*(**(arg2 + 0x250) + 0xc))())
ascension::CConstructInstance::PutCardUnderConstruct(*(arg2 + 0x250))
uint32_t r1_4 = zx.d(*(r6 + 8))
uint32_t var_28 = r1_4
ascension::CWorld::OutputAnimationCard(r8, arg3, 8, 1, r1_4, 4, zx.d(*(*(arg2 + 0x250) + 8)), 
    &__elf_symbol_table[0xfe1].st_name:2)
ascension::CPlayer::RemoveCardFromHand(r6)
int32_t* result = *(arg2 + 0x254)

if (result != 0)
    void* r2_2 = result + *result + 4
    uint32_t r1_8 = zx.d(*r2_2)
    
    if (r1_8 u<= 7)
        uint32_t r3_1 = zx.d(*(arg3 + 8))
        *r2_2 = r1_8.b + 1
        result = &result[*result * 8 + r1_8]
        result[4] = r3_1

return result
