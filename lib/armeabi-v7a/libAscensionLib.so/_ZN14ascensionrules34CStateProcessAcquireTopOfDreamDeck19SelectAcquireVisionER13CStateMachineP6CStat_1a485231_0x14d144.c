// 函数: _ZN14ascensionrules34CStateProcessAcquireTopOfDreamDeck19SelectAcquireVisionER13CStateMachineP6CStateiPj
// 地址: 0x14d144
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg3 == 0)
    return 

ascension::CPlayer* r6_1 = *(arg2 + 0x24c)
void* r4_1 = *(arg3 + 0xc)
char* r7_1 = *(r6_1 + 4)
core::CWorldBase::OutputMessageFormat(r7_1, "%s acquires %s\n", r6_1 + 0x10, (*(*arg3 + 0xc))(arg3))

if (*(r4_1 + 0x88) != 9)
    return 

int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r7_1, arg3, 1, 0xc, 0, 0xb, 0, 0)
ascension::CWorld::PopRevealCard(r7_1)
int32_t var_38 = 0
ascension::CWorld::OutputEvent(r7_1, 0x1b, zx.d(*(r6_1 + 8)), zx.d(*(arg3 + 8)))
ascensionrules::CreateStatePlayVisionFromDreamscape(r6_1, arg3)
return CStateMachine::PushState(arg1) __tailcall
