// 函数: _ZN14ascensionrules42CStateProcessAcquireHeroOfHonorValueToHand18AcquireFromKingdomER13CStateMachinePN9ascension26CCardStackUniformAscensionEj
// 地址: 0x1233dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = *(arg1 + 0x24c)
uint32_t r6 = *(r5 + 4)

if (*(arg3 + 0x10) s>= 1)
    core::CCardStackUniform::SetCardCount(arg3)

uint32_t r0_3
uint32_t r3_1
r0_3, r3_1 = ascension::CCardStackUniformAscension::TakeSampleCardInstance()
void* r0_4 = *(arg3 + 0x14)

if (r0_4 != 0)
    r3_1 = zx.d(*(r0_4 + 8))

int32_t var_28 = *(arg3 + 0x10)

if (r0_4 == 0)
    r3_1 = 0

ascension::CWorld::OutputEvent(r6, 0x21, zx.d(*(arg3 + 8)), r3_1)
int32_t r3
int32_t var_24 = r3
ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
    operator new(0x990), r5, r0_3, 6, zx.d(*(arg3 + 8)))
CState::AddOwnedChild(arg1)
return CStateList::AppendState(arg1) __tailcall
