// 函数: _ZN14ascensionrules29CStateProcessAcquirePotOfGold23AcquireFromEndOfRainbowER13CStateMachinePN9ascension26CCardStackUniformAscensionEji
// 地址: 0x125cc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = *(arg1 + 0x24c)
uint32_t r6 = *(r5 + 4)

if (*(arg3 + 0x10) s>= 1)
    core::CCardStackUniform::SetCardCount(arg3)

uint32_t r0_3 = ascension::CCardStackUniformAscension::TakeSampleCardInstance()
void* r0_4 = *(arg3 + 0x14)
uint32_t r3 = 0

if (r0_4 != 0)
    r3 = zx.d(*(r0_4 + 8))

int32_t var_30 = *(arg3 + 0x10)
ascension::CWorld::OutputEvent(r6, 0x21, zx.d(*(arg3 + 8)), r3)
int32_t var_30_1 = 0
ascension::CWorld::OutputEvent(r6, 0x2a, zx.d(*(r5 + 8)), 0)
int32_t var_2c = arg4
ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
    operator new(0x990), r5, r0_3, 0x15, zx.d(*(arg3 + 8)))
CState::AddOwnedChild(arg1)
return CStateList::AppendState(arg1) __tailcall
