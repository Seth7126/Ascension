// 函数: _ZN14ascensionrules57CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated19SelectAcquireToHandER13CStateMachineP6CStateiPj
// 地址: 0x133944
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg3 == 0)
    return 

core::CCardInstance* r9_1 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r7_1 = *(r9_1 + 4)

if (*(r7_1 + 0x30) u< 6)
label_133a10:
    int32_t var_24 = 1
    ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
        operator new(0x990), r9_1, arg3, 0xc, 0)
    CState::AddOwnedChild(arg2)
    return CStateList::AppendState(arg2) __tailcall

arg1 = *(arg2 + 0x25c)

if (arg1 s< 1)
    return 

void* __offset(CState, 0x2a0) r6_1 = arg2 + 0x2a0
int32_t r1 = 0

while (*(r6_1 - 0x40) != arg3)
    r1 += 1
    r6_1 += 0x44
    
    if (r1 s>= arg1)
        return 

void* r0_1 = *r6_1

if (r0_1 == 0xffffffff)
    r0_1 = memchr(r6_1 - 0x20, 1, *(r6_1 - 0x24)) - (r6_1 - 0x20)

if (zx.d(*(r6_1 + (r0_1 << 1) - 0x10)) != 0)
    core::CWorldBase::GetInstanceByID(r7_1)
    ascension::CWorld::PlayActiveEffect(r7_1)

goto label_133a10
