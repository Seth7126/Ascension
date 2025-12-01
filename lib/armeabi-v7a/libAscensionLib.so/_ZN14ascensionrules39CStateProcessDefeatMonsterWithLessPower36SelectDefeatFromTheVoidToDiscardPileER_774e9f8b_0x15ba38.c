// 函数: _ZN14ascensionrules39CStateProcessDefeatMonsterWithLessPower36SelectDefeatFromTheVoidToDiscardPileER13CStateMachineP6CStateiPj
// 地址: 0x15ba38
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

core::CCardInstance* r6_1 = *(arg2 + 0x24c)
uint32_t r8_1 = *(r6_1 + 4)

if (zx.d(*(arg2 + 0x255)) == 0 && zx.d(*(r8_1 + 0xb34)) == 0)
    ascension::CWorld::RemoveDefeatNonTrophyMonsterFromVoid(r8_1)

core::CWorldBase::OutputMessageFormat(r8_1, "%s defeats %s from The Void\n", r6_1 + 0x10, 
    *(arg3 + 0xc) + 4)
int32_t var_28_1 = 0
ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(
    operator new(0x99c), r6_1, arg3, 9, 0xfffffffe, true, false, true)
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
int32_t* r0_8 = *(arg2 + 0x260)

if (r0_8 != 0)
    void* r2_3 = r0_8 + *r0_8 + 4
    uint32_t r1_4 = zx.d(*r2_3)
    
    if (r1_4 u<= 7)
        uint32_t r3_1 = zx.d(*(arg3 + 8))
        *r2_3 = r1_4.b + 1
        r0_8[*r0_8 * 8 + r1_4 + 4] = r3_1

arg1 = *(arg2 + 0x25c)

if (arg1 != 0 && zx.d(*(r8_1 + 0xa14)) == 0)
    uint32_t var_38 = zx.d(*(arg1 + 8))
    ascension::CWorld::OutputEvent(r8_1, 0x15, zx.d(*(r6_1 + 8)), zx.d(*(arg3 + 8)))
